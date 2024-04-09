package perri_alessandro.U5w2D2.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(long id) {
        super("Elemento con id " + id + " non è stato trovato.");
    }
}
