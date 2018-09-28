package seedu.addressbook.data.person;


import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a contact information.
 */
public abstract class Contact {

    public String value;
    protected boolean isPrivate;

    public Contact(boolean isPrivate)  {
        this.isPrivate = isPrivate;
    }

    @Override
    public String toString() {
        return value;
    }

    public abstract boolean equals(Object other);

    public abstract boolean isValidValue(String test);

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }


}
