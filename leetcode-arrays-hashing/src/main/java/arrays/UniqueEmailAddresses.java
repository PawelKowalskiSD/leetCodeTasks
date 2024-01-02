package arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        Set<String> resultSet = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String[] splitEmail = emails[i].split("@");
            String localName = splitEmail[0];
            String domain = splitEmail[1];
            String[] nextSplit = localName.split("\\+");
            localName = nextSplit[0].replace(".", "");
            resultSet.add(localName + "@" + domain);
        }
        return resultSet.size();
    }
}
