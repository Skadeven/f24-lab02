import { newRenderer } from "./renderer.js"
import { newRectangle } from "./shapes/rectangle.js";
import { newCircle } from "./shapes/circle.js";

// const rectangle: Rectangle = newRectangle(2, 3)
const circle: Shape = newCircle(2)
const renderer = newRenderer(circle)
renderer.draw();