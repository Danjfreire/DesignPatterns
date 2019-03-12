package Behavioral.Mediator;

public class Test {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Daniel");
        User user2 = new UserImpl(mediator, "João");
        User user3 = new UserImpl(mediator, "Maria");
        User user4 = new UserImpl(mediator, "Ana");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
        user3.send("Hello there");
    }

}
