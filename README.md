# 🧪 Section-A: Swiggy Selenium Automation

## 📜 Problem Statement
Automate the process of ordering food on [Swiggy](https://www.swiggy.com/) using **Selenium WebDriver** in Java.  
The automation script should simulate the end-to-end user journey from login to payment page (excluding actual payment), while validating page titles, capturing screenshots, and generating console logs.

---

## 🎯 Objectives
The goal of this project is to:
- Automate Swiggy’s food ordering flow.
- Perform validations at each step (page title, URL, cart total, etc.).
- Capture screenshots at major stages.
- Generate console logs.
- Record the complete execution for demonstration.

---

## 🧰 Tools and Technologies
- **Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **IDE:** Eclipse  
- **Build Tool:** Maven  
- **Browser:** Google Chrome  
- **Testing Framework (optional):** TestNG / JUnit  
- **Screen Recording Tool:** Any (e.g., OBS Studio, Xbox Game Bar)

---

## ⚙️ Steps Implemented

### **Step 1: Login to Swiggy**
- Open [Swiggy](https://www.swiggy.com/).
- Click on **Login**, enter a valid phone number.
- Wait for manual OTP entry using `Thread.sleep()`.

### **Step 2: Validate Page Title and Current URL**
- Once logged in, print the **page title** and **current URL** to verify successful login.

### **Step 3: Enter Delivery Location**
- Locate the delivery search bar.
- Enter a city name (e.g., *Bengaluru* or *LPU*) and select from the suggestions.

### **Step 4: Search for a Restaurant**
- Use the search bar to find a restaurant (e.g., *Domino’s Pizza*).
- Click on the first search result.

### **Step 5: Select Food Item**
- Browse the restaurant menu.
- Select and add a food item to the cart.
- Navigate to **View Cart**.

### **Step 6: Increase Item Quantity**
- In the cart, increase item quantity to 2.
- Capture the updated cart total in console logs.

### **Step 7: Enter Delivery Address**
- Provide **door/flat number**, **landmark**, and save address as *Home*.
- Click **Save Address & Proceed**.

### **Step 8: Proceed to Payment Page**
- Click on **Proceed to Pay**.
- Ensure navigation to the payment page (do not complete the payment).

### **Step 9: Capture Screenshots and Logs**
- Capture screenshots at each major step:
  - Adding item
  - Updating quantity
  - Entering address
  - Proceeding to payment  
- Print console logs: restaurant name, food item, and cart total.

### **Step 10: Record Execution**
- Use any screen recording software to record the full execution.
- Upload the video to **Google Drive** and share for evaluation.
