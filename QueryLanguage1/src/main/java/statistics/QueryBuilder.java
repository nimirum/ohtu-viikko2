package statistics;

import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.True;
import statistics.matcher.Not;
import statistics.matcher.Or;
import statistics.matcher.PlaysIn;

public class QueryBuilder {

    Matcher matcher;

    public QueryBuilder() {
        matcher = new True();
    }

    public QueryBuilder playsIn(String team) {
        and(new PlaysIn(team));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        and(new HasFewerThan(value, category));
        return this;
    }

    public QueryBuilder hasAtLeast(int value, String category) {
        and(new HasAtLeast(value, category));
        return this;
    }

    public QueryBuilder not() {
        matcher = new Not(matcher);
        return this;
    }

    public Matcher build() {
        Matcher m = matcher;
        this.matcher = null;
        return m;
    }

    public QueryBuilder oneOf(Matcher... matchers) {
        matcher = new Or(matchers);
        return this;
    }

    private void and(Matcher m) {
        if (this.matcher == null) {
            this.matcher = new And(m);
        }
        this.matcher = new And(matcher, m);
    }

}
