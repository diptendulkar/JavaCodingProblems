package designPatterns.singleton;


public class MySingleton {
    private static MySingleton mySingleton = null;
    private MySingleton() {
    }
    public static MySingleton getMySingleton() {
        // First check without syncronization for better performance
        if (mySingleton == null) {
            // Synchronize only when instance is null
            synchronized (MySingleton.class) {
                // double check pattern
                if (mySingleton == null)
                    mySingleton = new MySingleton();
            }
        }
        return mySingleton;
    }

}

