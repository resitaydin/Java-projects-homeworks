package vLDLinkedList;

/** Contains a main method to test some scenarios for the social media software.
 * @author R.A.
 * @version 1.0
 * @since 2023-03-19
*/

public class TestClass2 {
    /** Main method to test the functions
     * @param args Arguments for main
     */
    public static void main(String[] args) {

        System.out.println("\n------------------SCENARIO 1 STARTS--------------------\n");

        LDLinkedList <Account> accounts = new LDLinkedList <Account> ();

        System.out.println("Creating accounts...");

        accounts.add(new Account(1,"gizemsungu", "13.01.1993", "Istanbul"));
        System.out.println("An account with username gizemsungu has been created.");

        accounts.add(new Account(2,"sibelgulmez", "10.03.1995", "Istanbul"));
        System.out.println("An account with username sibelgulmez has been created.");

        accounts.add(new Account(3,"gokhankaya", "19.03.1986", "Ankara")) ;
        System.out.println("An account with username gokhankaya has been created.\n");

        System.out.println("Logging into an account (username: sibelgulmez)…");
        accounts.get(1).login(accounts);

        System.out.println("Sharing two posts…");

        Post post1 = new Post(1, "I like Java.");
        Post post2 = new Post(2, "Java the coffee...");

        accounts.get(1).addPost(post1);
        accounts.get(1).addPost(post2);
        
        System.out.println("Following gizemsungu and gokhankaya...");

        accounts.get(1).follow(accounts.get(0));
        accounts.get(1).follow(accounts.get(2));
        

        System.out.println("Logging out from account 'sibelgulmez'…\n\n");
        accounts.get(1).logout();

        System.out.println("Logging into another account (username: gokhankaya)…");
        accounts.get(2).login(accounts);
        
        accounts.get(2).viewProfile(accounts.get(1));

        accounts.get(2).viewPosts(accounts.get(1));

        System.out.println("Liking a post of sibelgulmez..");
        accounts.get(2).addLike(post1, accounts);

        System.out.println("Adding a comment on a post of sibelgulmez...");
        accounts.get(2).addComment(post1,"me too!", accounts);

        System.out.println("\nFollowing sibelgulmez and gizemsungu...");

        accounts.get(2).follow(accounts.get(1));
        accounts.get(2).follow(accounts.get(0));

        System.out.println("\nSending a message to gizemsungu...");

        accounts.get(2).message("This homework is too easy!", accounts.get(0));

        System.out.println("Logging out from account 'gokhankaya'..\n");
        accounts.get(2).logout();

        System.out.println("Logging into another account (username: gizemsungu) … ");
        accounts.get(0).login(accounts);

        accounts.get(0).checkOutbox();
        accounts.get(0).checkInbox();
        accounts.get(0).viewInbox(accounts);
        System.out.println("--------------");
        accounts.get(0).viewProfile(accounts.get(1));
        accounts.get(0).viewPosts(accounts.get(1));

        accounts.get(0).viewPostInteractions(accounts.get(1), accounts);

        System.out.println("\nLiking sibelgulmez's posts...");
        accounts.get(0).addLike(post1, accounts);
        accounts.get(0).addLike(post2, accounts);

        accounts.get(0).viewPostInteractions(accounts.get(1), accounts);

        System.out.println("\n------------------SCENARIO 1 ENDS--------------------\n");
        
        ////////////////////////////////////////////////////////

        System.out.println("\n------------------SCENARIO 2 STARTS--------------------\n");

        System.out.println("'gizemsungu' logs in.");
        accounts.get(0).login(accounts);

        System.out.println("Sharing two posts...");
        Post Post1 = new Post(3, "Today is a great day!");
        Post Post2 = new Post(4, "I love cats!");

        accounts.get(0).addPost(Post1);
        accounts.get(0).addPost(Post2);

        System.out.println("'gizemsungu' logs out.\n");
        accounts.get(0).logout();

        System.out.println("'sibelgulmez' logs in.");
        accounts.get(1).login(accounts);

        accounts.get(1).viewProfile(accounts.get(0));

        System.out.println("liking Post1...");
        accounts.get(1).addLike(Post1, accounts);

        System.out.println("'sibelgulmez' logs out.\n");
        accounts.get(1).logout();

        System.out.println("'gokhankaya' logs in.");
        accounts.get(2).login(accounts);

        accounts.get(2).viewProfile(accounts.get(0));

        System.out.println("Commenting on Post2..");
        accounts.get(2).addComment(Post2, "Nice", accounts);

        System.out.println("Sending a message to 'gizemsungu' .");
        accounts.get(2).message("Hello", accounts.get(0));

        System.out.println("'gokhankaya' logs out.\n");
        accounts.get(2).logout();

        System.out.println("'gizemsungu' logs in.");
        accounts.get(0).login(accounts);

        System.out.println("Viewing her own profile...");
        accounts.get(0).viewProfile(accounts.get(0));

        accounts.get(0).checkInbox();
        accounts.get(0).viewInbox(accounts);

        System.out.println("\n------------------SCENARIO 2 ENDS--------------------\n");

    }
}
