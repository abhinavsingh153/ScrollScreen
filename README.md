# Infinite Scrolling Background (libGDX)

This project demonstrates how to create an **infinite scrolling background** in a 2D Android game using the **libGDX framework**.

The background image continuously scrolls horizontally to simulate movement, which is commonly used in endless runner or side-scrolling games.

## 🎥 Demo

[![Watch the demo](https://img.youtube.com/vi/orCmNKfTyus/maxresdefault.jpg)](https://youtu.be/orCmNKfTyus)

▶ Click the image to watch the video demo.

## 🚀 Features

- Infinite horizontal background scrolling
- Seamless image repetition
- Implemented using libGDX SpriteBatch rendering
- Suitable for endless runner style games

## 🧠 How It Works

The technique works by:

1. Drawing the background texture **twice**
2. Moving the X coordinate every frame
3. Resetting the position when the image leaves the screen

