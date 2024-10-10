package bo.codexd.invoice.engine.api.service;

/**
 * Created by yoshi on 12 October 2023
 */
public class Constants {
    /*SPRING SYSTEM*/
    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";
    public static final String SPRING_PROFILE_TEST = "test";
    public static final String SPRING_PROFILE_E2E = "e2e";
    public static final String SPRING_PROFILE_PRODUCTION = "prod";
    public static final String SPRING_PROFILE_CLOUD = "cloud";
    public static final String SPRING_PROFILE_HEROKU = "heroku";
    public static final String SPRING_PROFILE_AWS_ECS = "aws-ecs";
    public static final String SPRING_PROFILE_AZURE = "azure";
    public static final String SPRING_PROFILE_API_DOCS = "api-docs";
    public static final String SPRING_PROFILE_NO_LIQUIBASE = "no-liquibase";
    public static final String SPRING_PROFILE_K8S = "k8s";

    /*SIAT CONNECTION*/
    public static final String CONNECT_TIMEOUT = "com.sun.xml.internal.ws.connect.timeout";
    public static final String REQUEST_TIMEOUT = "com.sun.xml.internal.ws.request.timeout";

    /*ROLES*/
    public static final String ADMIN = "ROLE_ADMIN";
    public static final String USER = "ROLE_USER";
    public static final String ANONYMOUS = "ROLE_ANONYMOUS";

    public static final String SIAT_AUTHORIZATION = "siat-authorization";

}
