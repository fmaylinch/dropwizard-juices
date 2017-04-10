package com.codethen.juices;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class JuicesApplication extends Application<JuicesConfiguration> {

	public static void main(String[] args) throws Exception {
        new JuicesApplication().run(args);
    }

    @Override
    public String getName() {
        return "juices";
    }

    @Override
    public void initialize(Bootstrap<JuicesConfiguration> bootstrap) {
        // bootstrap.addBundle(new AssetsBundle("/assets/", "/"));
    }

    @Override
    public void run(JuicesConfiguration configuration, Environment environment) {

	    JuicesResource juiceResources = new JuicesResource();
        environment.jersey().register(juiceResources);
    }
}
