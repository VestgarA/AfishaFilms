public class ManagerFilms {
    private Afisha[] afisha = new Afisha[0];

    public void save(Afisha afish) {
        Afisha[] tmp = new Afisha[afisha.length + 1];

        for (int i = 0; i < afisha.length; i++) {
            tmp[i] = afisha[i];
        }
        tmp[tmp.length - 1] = afish;
        afisha = tmp;
    }

    public Afisha[] findAll() {
        Afisha[] all = afisha;
        for (int i = 0; i < all.length; i++) {
        }
        return all;
    }

    public Afisha[] findLast() {
        Afisha[] all = afisha;
        Afisha[] reversed = new Afisha[all.length];
        for (int i = 0; i < all.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public Afisha[] getItems() {
        return afisha;
    }
}
