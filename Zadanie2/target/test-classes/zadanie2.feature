Feature: Zadanie2


Scenario: dokonywanie zakupu w sklepie
Given jako zarejestrowany użytkownik loguję się na stronę sklepu
When jestem na stronie z produktami
And wybiorę Hummingbird Printed Sweater
And wybiorę 5 sztuk w rozmiarze M
And przejdę do opcji checkout
And potwierdzę adres
And wybiorę metodę płatności Pay by Check
And kliknę na “order with an obligation pay”
Then zrobię screenshot z potwierdzeniem zamówienia
