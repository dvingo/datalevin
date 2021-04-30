(def version "0.4.30")

(defproject datalevin-native version
  :description "Datalevin GraalVM native image and command line tool"
  :parent-project {:path    "../project.clj"
                   :inherit [:managed-dependencies :profiles :jvm-opts
                             :deploy-repositories :global-vars
                             :uberjar-exclusions]}
  :dependencies [[org.clojure/clojure]
                 [org.clojure/tools.cli]
                 [persistent-sorted-set]
                 [borkdude/sci]
                 [com.cognitect/transit-clj]
                 [nrepl/bencode]
                 [com.taoensso/nippy]
                 [org.graalvm.sdk/graal-sdk]
                 [org.graalvm.nativeimage/svm]
                 [org.lmdbjava/lmdbjava]
                 [org.clojure/test.check]
                 [babashka/babashka.pods]]
  :source-paths ["src/clj" "../src" "../test"]
  :java-source-paths ["src/java"]
  :javac-options ["--release" "11"]
  :test-paths ["../test"]
  :plugins [[lein-parent "0.3.8"]]
  )
