;;https://exercism.org/tracks/clojure/exercises/tracks-on-tracks-on-tracks
defn new-list
  "Creates an empty list of languages to practice."
  []
  (list))

(defn add-language
  [lang lang-list]
    (conj lang-list lang))

(defn first-language
  "Returns the first language on the list."
  [lang-list]
  (first lang-list))

(defn remove-language
  "Removes the the last language added to the list."
  [lang-list]
  (drop 1 lang-list))

(defn count-languages
  "Returns the total number of languages on the list."
  [lang-list]
  (count lang-list))

(defn learning-list
  "Creates an empty list, adds Clojure and Lisp, removes Lisp, adds
  Java and JavaScript, then finally returns a count of the total number
  of languages."
  []
  (new-list)
  (add-language "Clojure" '("Lisp"))
  (remove-language '("Lisp" "Clojure"))
  (add-language "Java" '("JavaScript"))
  (count-languages '("Java" "JavaScript" "Clojure")))