public class RestPreconditions {
    public static <T> T checkFound(T resource) {
        if (resource == null) {
            try {
                throw new MyResourceNotFoundException();
            } catch (MyResourceNotFoundException e) {
                e.printStackTrace();
            }
        }
        return resource;
    }

    public static void checkNotNull(Book book) {
        if (book == null) try {
            throw new MyResourceNotFoundException();
        } catch (MyResourceNotFoundException e) {
            e.printStackTrace();
        }
    }
}