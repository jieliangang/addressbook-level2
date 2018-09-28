package seedu.addressbook.data.person;


import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a contact information.
 */
public class Contact {

    public String value;
    protected boolean isPrivate;

    public Contact(boolean isPrivate)  {
        this.isPrivate = isPrivate;
    }

    @Override
    public String toString() {
        return value;
    }


    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }


}
