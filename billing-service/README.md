<h1> La microservice billing-service </h1>
<h2> 1. La couche DAO </h2>
<h2> 1.1. La classe Invoice </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199315692-c481fa82-6f17-4c0f-8716-37234ac6c4e6.png"></kbd>
<h2> 1.2. La classe Customer (classe non persistent) </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199315971-540c3e62-b710-4c61-bb9c-1aad7a336073.png"></kbd>
<h2> 2. La couche DTO </h2>
<h2> 2.1. La classe InvoiceRequestDTO </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199316203-85f78865-3c13-41d9-8168-1e9fabdd2e6e.png"></kbd>
<h2> 2.2. La classe InvoiceResponseDTO </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199316440-4050bbc3-0d90-4a19-b946-e0f900f80c52.png"></kbd>
<h2> 3. Le mapper </h2>
<h2>3.1. L'interface InvoiceMapper </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199316616-afe3cdc2-593b-4a56-a081-90640421ccb3.png"></kbd>
<h2> 4. La couche de communication avec le service customer (openFeign)</h2>
<h2>4.1. La classe service </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199317016-f7c050c3-a6ec-48cd-afd8-7294d7de3365.png"></kbd>
<h2>5. La classe service </h2>
<h2>5.1. L'interface InvoiceService </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199317611-7d5bd7fd-edfd-4aa9-b18f-4f101d600e38.png"></kbd>
<h2>5.2. La classe InvoiceServiceImpl </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199317882-2da24a24-492f-47f8-9967-2e67adfb55cd.png"></kbd>
<h2> 5. La couche web </h2>
<h2>5.1. La classe controleur InvoiceRestController </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199318066-1e4dd016-394b-4562-a9e5-889017cf9aca.png"></kbd>
<h2>5.2. Vérifier le fonctionnemnt de rest api </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199318238-182a9a85-2a3c-4609-a857-a03ee8336690.png"></kbd>
<h2> 6. L'ajout des enregistrement dans la table Invoice </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199318343-da18f023-736a-49c7-bc84-29496ed06602.png"></kbd>
<h2> 7. Le fichier de configuration (application.properties) </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199318448-2805bc25-dd67-4ad6-90d0-e727461282ed.png"></kbd>
<h2> 8.La Documentation swagger </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199318596-6ae27bca-0d9b-4bb3-86b5-d6bd04f38e7f.png"></kbd>
