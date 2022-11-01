<h1>La partie du déploiment des services en utilisant docker et docker-compose </h1>
<h2>Le fichier Dockerfile de chaque service : </h2>
<h3> customer service: </h3>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199354040-bb342af6-4f20-4d6a-b0c5-426c629ad0e5.png"></kbd>
<h3> billing service: </h3>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199354104-cfedc408-a760-4ec6-963c-68157cbfa40d.png"></kbd>
<h3> Gateway: </h3>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199354189-0b438269-d60d-40aa-a3fc-882b8f0472ad.png"></kbd>
<h3> eurika server: </h3>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199354294-38b33408-a8cb-4bc8-a19f-0b6b91dc99d8.png"></kbd>
<h2>Le fichier docker-compose  qui permet de déployer les différents services sur des conteneurs docker: </h2>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199354469-7bf8b9dc-45ac-4366-85a8-9e15da33a8e3.png"></kbd>
<h2>Vérifier le fonctionnement des services dans les conteneurs docker : </h2>
<h3> Voici la liste des conteneurs qui sont en etat d'éxécution : </h3>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199355052-c28472bb-f35b-45fd-ab3a-45ac0a4311f9.png"></kbd>
<h3>Voici les microservices et la gateway sont enregistrés dans le serveur eureka   : </h3>
<kbd><img src="https://user-images.githubusercontent.com/80115513/199355313-0d99216e-e030-4365-a6ae-4eea73363e8f.png"></kbd>
