(defproject purchase-validator "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [communication "0.1.0"]
                 [core "0.1.0"]
                 [com.google.code.gson/gson "2.8.5"]
                 [org.clojure/data.json "2.3.1"]]
  :repl-options {:init-ns br.com.marinho.creditmodel.purchase-validator.core
                 :timeout 120000})
