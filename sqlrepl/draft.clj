

;; {:database-url "jdbc:postgresql:/lumapp_dev?user=lumapp&password=lumapp"}

(use '[clojure.java.jdbc])
(def database {:subprotocol "postgresql"
               :subname "//127.0.0.1:5434/lumapp_dev"
               :user "lumapp"
               :password "lumapp"})

;; (with-db-connection [connection database]
;;     (let [result (query connection
;;                         ["SELECT * FROM search_history WHERE search_id='iphone6' LIMIT  15"])]
;;       result))

(query database ["SELECT * FROM search_history LIMIT 5"])
;; (query database ["SELECT * FROM search_history WHERE search_id='iphone6' LIMIT 5"])
