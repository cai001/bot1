class Run {
    public static void main(String args[]) throws Exception {
        Urlsel urlsel = new Urlsel();
        int stat = urlsel.status("http://google.com");
        System.out.println(stat);

    }
}
