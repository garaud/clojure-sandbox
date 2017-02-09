(defproject sqlrepl "0.1.0-SNAPSHOT"
  :description "Simple project to carry out some SQL queries"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/java.jdbc "0.3.6"]
                 [org.postgresql/postgresql "9.4-1206-jdbc4"]
                 [org.xerial/sqlite-jdbc "3.8.6"]]
  :jvm-opts ["-Duser.timezone=UTC"])
