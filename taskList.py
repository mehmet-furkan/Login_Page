


# gorevler = [] # Boş listeyi oluşturur.

# # Kullanıcıdan girdi alır ve bir değişkene kaydeder.
# yeni_gorev = input("Lütfen bir görev girin: ") 

# # Alınan girdiyi listenin sonuna ekler.
# gorevler.append(yeni_gorev)
# print(gorevler)

gorevler = []

while True:
    print("--- Yapilacaklar Listesi ---")
    print("1: Görev Ekle")
    print("2: Görevleri Listele")
    print("3: Çikiş Yap")

    secim = input("Lütfen bir eylem seçin 1/2/3 : ") 
    # Şimdi kullanıcının seçimine göre işlem yapacağız.

    if secim == "1":
    # Seçim "1" ise yapılacaklar buraya gelecek.
    yeni_gorev = input("Lütffen eklenecek görevi girin: ")
    gorevler.append(yeni_gorev)
    print("Göreviniz eklendi!")  # Kullanıcıya geri bildirim vermek iyi bir alışkanlıktır.
    
    elif 
    secim == "2"
    print("\n--- Görevler ---")  # Başlık ekleyerek çıktıyı güzelleştirelim.
    print(gorevler)
    print("----------------\n")

    elif
    secim == "3"
    print("Programdan çikiliyor...")
    break  #Döngüyü sonlandırır.

else:
print("Geçersiz bir seçim yaptiniz. Lütfen tekrar deneyin.")




