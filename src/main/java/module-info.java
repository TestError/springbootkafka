/**
 *
 */
module spring.boot.kafka {

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.webflux;
    requires reactor.core;
    requires spring.web;

    requires java.sql;

    opens priv.cp;

}