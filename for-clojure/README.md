# 4Clojure

Solutions for some [4Clojure](https://4clojure.com) problems.

One function for each solution. See `src/for_clojure/core.clj`.

The tests are implemented in the file `test/for_clojure/core_test.clj`. The name
of the test function contains the problem number,
e.g. `test-problem-15-double-down` for
the [problem 15](https://www.4clojure.com/problem/15).

It's important to note that for some problems, some Clojure functions are
forbidden such as `nth` or `reverse`.

To see all the test functions, just do:

`ag --clojure "test-problem-\d+"` or `grep -R "deftest test-problem"`.

I kept the problems where you have to write a function. Other elementary
problems where you fill a value are not implemented here.

You can just clone the project, remove the content of the file
`src/for_clojure/core.clj` and implement your own functions/solutions for
all available test cases.

## Usage

Launch the tests with lein:

`lein test`

In the REPL with `lein repl`:

- `(require 'for-clojure.core-test)`
- `(clojure.test/run-tests 'for-clojure.core-test)`
