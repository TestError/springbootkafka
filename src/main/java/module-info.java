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
    requires spring.boot.starter.data.redis.reactive;

    requires spring.beans;
    requires spring.boot.starter.data.redis;
    requires spring.data.redis;
    requires spring.data.keyvalue;

    requires java.sql;
    requires slf4j.api;

    opens priv.cp;

}