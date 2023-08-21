public class Individual extends Account {
    @Override
    public AuthenticationStatus login(String email, String password) throws InvalidAuthenticationException {
        return null;
    }

    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        // Bireysel müşteri için sigorta ekleme işlemi
    }

}
