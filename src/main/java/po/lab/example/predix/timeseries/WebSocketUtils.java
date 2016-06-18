package po.lab.example.predix.timeseries;

import org.apache.tomcat.websocket.pojo.PojoEndpointClient;
import org.springframework.http.HttpHeaders;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class WebSocketUtils {

    public static final String ZONE_ID_HEADER = "Predix-Zone-Id";
    public static final String LOCALHOST_URL = "http://localhost/";

    public static Session openWebSocket(String url, Object pojoEndpoint, String zoneId, String accessToken)
            throws DeploymentException, IOException {
        return openWebSocket(url, pojoEndpoint, createConfigurator(zoneId, accessToken));
    }

    public static Session openWebSocket(String url, Object pojoEndpoint, ClientEndpointConfig.Configurator configurator)
            throws DeploymentException, IOException {
        ClientEndpointConfig config = ClientEndpointConfig.Builder.create()
                .configurator(configurator)
                .build();
        Endpoint endpoint = new PojoEndpointClient(pojoEndpoint, Collections.emptyList());
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        return container.connectToServer(endpoint, config, URI.create(url));
    }

    public static ClientEndpointConfig.Configurator createConfigurator(final String zoneId, final String accessToken) {
        String authorizationToken = "Bearer " + accessToken;

        return new ClientEndpointConfig.Configurator(){
            @Override
            public void beforeRequest(Map<String, List<String>> headers) {
                addHeader(headers, ZONE_ID_HEADER, zoneId);
                addHeader(headers, HttpHeaders.AUTHORIZATION, authorizationToken);
                addHeader(headers, HttpHeaders.ORIGIN, LOCALHOST_URL);
            }

            private void addHeader(Map<String, List<String>> headers, String name, String value) {
                headers.computeIfAbsent(name, k -> new ArrayList<>()).add(value);
            }
        };
    }
}
