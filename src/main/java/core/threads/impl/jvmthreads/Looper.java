package core.threads.impl.jvmthreads;

import java.util.logging.Logger;

/**
 * A MonkeyLooper thread is the main application thread, could be a Ui-Thread, a Renderer thread for example...etc.
 *
 * @author pavl_g
 */
public class Looper extends AppThread {

    private static final Logger logger = Logger.getLogger(Daemon.class.getName());

    public Looper() {
        super(Looper.class.getName());
    }

    @Override
    public synchronized void start() {
        super.start();
        logger.info("MonkeyLooper Started");
    }
}
