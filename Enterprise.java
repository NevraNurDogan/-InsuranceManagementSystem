public class Enterprise extends  Account{
    @Override
    public AuthenticationStatus login(String email, String password) throws InvalidAuthenticationException {
        return null;
    }

    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        // Kurumsal müşteri için sigorta ekleme işlemi
    }
}
