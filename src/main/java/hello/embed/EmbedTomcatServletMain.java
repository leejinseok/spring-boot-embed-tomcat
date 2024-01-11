package hello.embed;

import hello.servlet.HelloServlet;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class EmbedTomcatServletMain {
    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        Connector connector = new Connector();
        connector.setPort(8080);
        tomcat.setConnector(connector);

        // 서블릿 등록
        tomcat.addContext("", "/");
        tomcat.addServlet("", "helloServlet", new HelloServlet());
    }
}
