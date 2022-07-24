# Banner
A  micro service using Java and Spring Boot
that manages a collection of operations with the basic feature: fetch, save, update, delete.Demonstrating CRUD API with SpringBoot

## Getting Started

### How To Create Firestore Database

You can follow the steps mentioned in [The Firebase Documentation](https://firebase.google.com/docs/firestore/quickstart)
  

* **Methods**

`GET`| `POST` | `DELETE` | `PUT`
* **URL**

    - `GET` :  /bizbanner
    - `POST` : /bizbanner
    - `GET` : /bizbanner/{id}
    - `PUT` : /bizbanner
    - `DELETE` : /bizbanner


* **URL Params**

    - **Required:**

        - `id=[integer]`


* **Data Params**
    - `POST`:
     ```` {
      "banners": [
      {
      "aspectRatio": "16:4",
      "bizBannerInfo": {
      "actionType": null,
      "bizId": "",
      "offeringCategory": "",
      "url": ""
      },
      "imgPath": "https://firebasestorage.googleapis.com/v0/b/bizbuzzzv2-prod.appspot.com/o/BizAroundMeBanner%2FbizBanner_8-6-2021_1623138347168?alt=media&token=5068e6c2-2d79-4cbd-9d02-3f2aee097ffe"
      },
      {
      "aspectRatio": "16:4",
      "bizBannerInfo": {
      "actionType": null,
      "bizId": "",
      "offeringCategory": "",
      "url": ""
      },
      "imgPath": "https://firebasestorage.googleapis.com/v0/b/bizbuzzzv2-prod.appspot.com/o/BizAroundMeBanner%2FbizBanner_8-6-2021_1623138353605?alt=media&token=cd640bd2-2d60-4c02-89bd-c5f8cf5e0ae2"
      },
      {
      "aspectRatio": "16:4",
      "bizBannerInfo": {
      "actionType": null,
      "bizId": "",
      "offeringCategory": "",
      "url": ""
      },
      "imgPath": "https://firebasestorage.googleapis.com/v0/b/bizbuzzzv2-prod.appspot.com/o/BizAroundMeBanner%2FbizBanner_8-6-2021_1623138361672?alt=media&token=f5e6fdbb-6ef1-4c41-9d54-fab1de271c35"
      },
      {
      "aspectRatio": "16:4",
      "bizBannerInfo": {
      "actionType": null,
      "bizId": "",
      "offeringCategory": "",
      "url": ""
      },
      "imgPath": "https://firebasestorage.googleapis.com/v0/b/bizbuzzzv2-prod.appspot.com/o/BizAroundMeBanner%2FbizBanner_8-6-2021_1623138370851?alt=media&token=61989257-d922-4318-8577-7449746666bb"
      }
      ],
      "createdDateTime": {
      "data_type": "timestamp",
      "value": "2021-06-08T07:46:15Z"
      },
      "id": "30509324-af7b-4bc4-aa48-8698891327bb",
      "latLng": {
      "data_type": "geopoint",
      "value": {
      "_latitude": 20.462521,
      "_longitude": 85.8829895
      }
      },
      "timerInMs": 7000,
      "updatedDateTime": {
      "data_type": "timestamp",
      "value": "2021-06-08T07:46:15Z"
      }
      }```
### STATUS CODE :
* **Success Response:**
    * **Code:** 200 <br />
        * **Content:** `{ id : 82959f08-98ea-497a-9ff0-2ab57cf1f3d3 }`

---
* **Error Response:**
    * **Code:** 500  Internal Server Error <br />

