# 📚 BookShelf – Android App

Book discovery app inspired by the UI design with hero banner,
recommendations, genres, and book detail screen.

---

## 🛠 Cách build APK (3 bước)

### Bước 1 – Cài Android Studio
Tải miễn phí tại: https://developer.android.com/studio

### Bước 2 – Mở project
1. Giải nén file `BookApp.zip`
2. Mở Android Studio
3. Chọn **File → Open** → chọn thư mục `BookApp`
4. Đợi Gradle sync xong (~2-3 phút lần đầu)

### Bước 3 – Build APK
1. Vào menu **Build → Build Bundle(s) / APK(s) → Build APK(s)**
2. Đợi build xong
3. Click **locate** để tìm file APK
4. APK nằm tại: `app/build/outputs/apk/debug/app-debug.apk`

---

## 📱 Cài lên điện thoại Android
1. Copy file `app-debug.apk` sang điện thoại
2. Vào **Cài đặt → Bảo mật → Cho phép cài từ nguồn không rõ**
3. Mở file APK và cài đặt

---

## 📁 Cấu trúc project
```
BookApp/
├── app/src/main/
│   ├── java/com/bookapp/
│   │   ├── MainActivity.kt        ← Màn hình chính
│   │   ├── BookDetailActivity.kt  ← Chi tiết sách
│   │   ├── Book.kt                ← Data model
│   │   └── ui/
│   │       ├── BookAdapter.kt     ← RecyclerView adapter sách
│   │       └── GenreAdapter.kt    ← RecyclerView adapter thể loại
│   └── res/
│       ├── layout/                ← XML layouts
│       ├── drawable/              ← Shapes & backgrounds
│       └── values/                ← Colors, strings, themes
└── build.gradle
```

## ✨ Tính năng
- Hero banner với badge NEW / EXCLUSIVE
- Horizontal scroll recommendations
- Genre circles (Fantasy, Thriller, Romance...)
- Book detail screen
- Bottom navigation bar
- Dark theme (#121212)
