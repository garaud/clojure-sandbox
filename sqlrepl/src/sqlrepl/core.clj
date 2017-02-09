(ns sqlrepl.core
  (:require [clojure.java.jdbc :refer :all]))


(def psql-db {:subprotocol "postgres"
              :subname "//127.0.0.1:5434/dbname"
              :user "username"
              :password "******"})

(def sqlite-db {:classname "org.sqlite.JDBC"
                :subprotocol "sqlite"
                :subname "data/tiny.db"})

;; TODO
;; (with-db-connection [connection database]
;;   (let [result (query connection
;;                       ["SELECT * FROM tbname WHERE id=1"])]
;;     result))
;; (query database ["SELECT * FROM tbname LIMIT 5"])
