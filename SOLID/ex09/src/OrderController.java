public class OrderController {
    private final OrderRepository repository;
    private final Logger logger;

    public OrderController(OrderRepository repository, Logger logger) {
        this.repository = repository;
        this.logger = logger;
    }

    public void create(String id) {
        repository.save(id);
        logger.log("Created order: " + id);
    }
}