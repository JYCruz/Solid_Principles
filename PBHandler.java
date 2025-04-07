public class PBHandler implements BookHandler{

    @Override
    public String handle(String type, String title) {
        if(type.equals("physical")){
            return " is borrowing a Physical Book: " + title;
        }
        else{
            return ": The Book your trying to borrow is not registered in the physical book category.\n Please use a different handler";
        }
    }
}
