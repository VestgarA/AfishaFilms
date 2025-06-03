public class ManagerFilms {
    private String[] afisha = new String[0];
    private int result;

    public ManagerFilms() {
        this.result = 5;
    }

    public ManagerFilms(int result) {
        this.result = result;
    }

    public String[] findLast() {
        int resultLength;

        if (afisha.length < result) {
            resultLength = afisha.length;
        } else {
            resultLength = result;
        }

        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = afisha[afisha.length - 1 - i];
        }
        return tmp;
    }

    public void save(String afish) {
        String[] tmp = new String[afisha.length + 1];

        for (int i = 0; i < afisha.length; i++) {
            tmp[i] = afisha[i];
        }
        tmp[tmp.length - 1] = afish;
        afisha = tmp;
    }

    public String[] findAll() {
        return afisha;
    }

    public String[] getItems() {
        return afisha;
    }
}
