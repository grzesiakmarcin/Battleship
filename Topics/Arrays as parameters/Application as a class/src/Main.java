class Application {

    String name;

    void run(String[] args) {
        System.out.println(name);
        
        for(String element: args)
        {
            System.out.println(element);
        }
    }
}
