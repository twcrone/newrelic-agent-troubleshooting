/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package newrelic.agent.troubleshooting;

import com.newrelic.api.agent.Trace;

public class App {
    public static void main(String[] args) {

        while(true) {
            createTransaction();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Trace(dispatcher = true)
    private static void createTransaction() {
        System.out.println("a transaction has been created!");
    }
}
