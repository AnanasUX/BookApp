# 🚀 Hướng dẫn Build APK miễn phí trên GitHub

## Bước 1 — Tạo tài khoản GitHub
👉 Vào https://github.com/signup và tạo tài khoản (miễn phí)

---

## Bước 2 — Tạo Repository mới
1. Đăng nhập GitHub
2. Nhấn nút **"+"** góc trên phải → **New repository**
3. Đặt tên: `BookApp`
4. Chọn **Public**
5. Nhấn **Create repository**

---

## Bước 3 — Upload code lên GitHub

### Cách A: Dùng GitHub Website (dễ nhất, không cần cài git)
1. Vào repo vừa tạo
2. Nhấn **uploading an existing file**
3. Giải nén `BookApp.zip` → kéo thả TẤT CẢ file vào
4. Nhấn **Commit changes**

### Cách B: Dùng Git (nếu đã cài git)
```bash
cd BookApp
git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/TEN_BAN/BookApp.git
git push -u origin main
```

---

## Bước 4 — Xem GitHub Actions tự build APK
1. Vào tab **Actions** trên repo của bạn
2. Thấy workflow **"Build APK"** đang chạy 🟡
3. Đợi ~5-10 phút cho đến khi thấy ✅ xanh

---

## Bước 5 — Tải APK về điện thoại
1. Click vào workflow run vừa xong ✅
2. Kéo xuống phần **Artifacts**
3. Click **BookApp-debug** để tải về
4. Giải nén → có file `app-debug.apk`

---

## Bước 6 — Cài APK lên điện thoại Android
1. Copy `app-debug.apk` sang điện thoại (qua USB / Google Drive / Zalo)
2. Trên điện thoại: **Cài đặt → Bảo mật → Cài từ nguồn không xác định → Bật**
3. Mở file `app-debug.apk` → nhấn **Cài đặt**
4. Mở app **BookShelf** và dùng! 📚

---

## ❓ Lưu ý
- GitHub Actions miễn phí 2000 phút/tháng (đủ để build hàng trăm lần)
- APK được lưu 30 ngày trên GitHub Artifacts
- Mỗi lần push code mới, APK sẽ tự động build lại
