package trial;

import java.util.Objects;

public class TrialOne {

    String string;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrialOne trialOne = (TrialOne) o;
        return Objects.equals(string, trialOne.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
