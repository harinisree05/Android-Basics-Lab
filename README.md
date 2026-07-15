# Android Studio - Fundamental Labs 📱

This repository contains a collection of native Android applications developed using **Java** and **Android Studio**. These projects demonstrate core mobile development fundamentals, including UI layout configurations, input stream parsing, dynamic view updating, options menu implementations, and intent messaging paradigms.

---

## 🚀 Projects Overview

### 1. URL & Message Intent App (`1-URL-Intent-App`)
Demonstrates how to utilize Android **Implicit Intents** to communicate and pass data from the application to external system apps.
* **Web Browsing:** Uses `Intent.ACTION_VIEW` along with a `Uri` parser to launch the device's default web browser to a specified URL.
* **SMS Messaging:** Uses `Intent.ACTION_SENDTO` with `tel:` URI schemes and intent extras (`sms body`) to prep messages for system communication.

```java
openURL.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com"));
        startActivity(intent);
    }
});
```
2. Simple Calculator (2-Simple-Calculator)
A clean utility application designed to practice fundamental View bindings, user input capturing, data type casting, and localized click listener operations.

Captures text streams from EditText inputs and safely parses them into data primitives (int).

Dynamically updates localized text components (TextView) with addition and subtraction results without screen refreshing.

3. Options Menu Application (3-Options-Menu-App)
Implements standard Android menu infrastructure to practice custom UI layouts and contextual user alerts.

Overrides onCreateOptionsMenu to seamlessly inflate a custom XML menu resource (menu_main).

Handles specific menu action selections via conditional ID routing (onOptionsItemSelected) to surface responsive user notifications via Toast.

```Java
@Override
public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();
    if (id == R.id.home) {
        Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show();
    }
    return true;
}
```
🛠️ Technical Stack
IDE: Android Studio

Language: Java

Core Components Used: View Bindings, Implicit Intents (ACTION_VIEW, ACTION_SENDTO), Menu Inflater, Event Listeners, and UI Widgets (EditText, TextView, Button, Toast).
