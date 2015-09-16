package org.apache.log4j;

import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App
{
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello World!" );
        int i= 0;
        while (true) {
            logger.info("test: "+i++);
            Thread.sleep(1000L);
            if (i > 10000) {
                break;
            }
        }
    }
}
