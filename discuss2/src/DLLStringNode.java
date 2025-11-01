public class DLLStringNode{
    DLLStringNode prev;
    String s;
    DLLStringNode next;

    public DLLStringNode(DLLStringNode prev,String s,DLLStringNode next)
    {
        this.prev=prev;
        this.s=s;
        this.next=next;
    }

    public static void main(String[] arguments)
    {
        DLLStringNode L=new DLLStringNode(null,"eat",null);
        L=new DLLStringNode(null,"bananas",L);
        L=new DLLStringNode(null,"never",L);
        L=new DLLStringNode(null,"sometimes",L);
        // sometimes->never->bananas->eat

        DLLStringNode M=L.next;

        DLLStringNode R=new DLLStringNode(null,"shredded",null);
        R=new DLLStringNode(null,"wheat",R);
        // wheat->shredded

        R.next.next=R;
        M.next.next=R.next;
        L.next.next=L.next.next.next;

        L=M.next;
        M.next.next.prev=R;
        L.prev=M;
        L.next.prev=L;
        R.prev=L.next.next;
        return;
    }
}