# 4Clojure

Solutions for some [4Clojure](https://4clojure.com) problems.

One function for each solution. See `src/for_clojure/core.clj`.

The tests are implemented in the file `test/for_clojure/core_test.clj`. The name
of the test function contains the problem number,
e.g. `test-problem-15-double-down` for
the [problem 15](https://www.4clojure.com/problem/15).

To see all the test functions, just do:

`ag --clojure "test-problem-\d+"` or `grep -R "deftest test-problem"`.

## Usage

Launch the tests with lein:

`lein test`

In the REPL with `lein repl`:

- `(require 'for-clojure.core-test)`
- `(clojure.test/run-tests 'for-clojure.core-test)`