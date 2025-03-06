class MongoDatabase implements Database {
    public void insert() {
        System.out.println("insert success from mongo");
    }

    public void update() {
        System.out.println("update success from mongo");
    }
    
    public void delete() {
        System.out.println("delete success from mongo");
    }
}
