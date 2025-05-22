# 📊 Relative Grading System in Java

## 📖 About the Project

This Java program calculates a student's **relative grade** based on the class's performance using **mean** and **standard deviation**. It implements a statistical approach to grading rather than using absolute marks, making it suitable for curved grading systems often used in competitive or university-level evaluations.

The final grade is awarded as one of: `S`, `A`, `B`, `C`, `D`, `E`, or `F`.

---

## 🧠 How It Works

1. **Input** the number of students and their marks.
2. **Calculate**:

   * Class **mean** (average marks)
   * **Standard deviation** of the marks
3. **User inputs their marks**, and the program:

   * Compares them to the statistical distribution
   * Assigns a grade based on the Z-score (distance from the mean in terms of std deviation)

---

## 📈 Grading Scale

| Z-Score Range                    | Grade |
| -------------------------------- | ----- |
| > 1.5σ above mean and marks ≥ 90 | S     |
| > 0.5σ to ≤ 1.5σ above mean      | A     |
| > -0.5σ to ≤ 0.5σ around mean    | B     |
| > -1.0σ to ≤ -0.5σ below mean    | C     |
| > -1.5σ to ≤ -1.0σ below mean    | D     |
| > -2.0σ to ≤ -1.5σ below mean    | E     |
| ≤ -2.0σ below mean               | F     |

---

## 🚀 How to Run

### Prerequisites:

* Java (JDK 8 or higher)

### Steps:

1. Save the code in a file named `RelativeGrading.java`
2. Open terminal/command prompt and navigate to the file directory.
3. Compile and run:

```bash
javac RelativeGrading.java
java RelativeGrading
```

4. Follow the prompts to enter:

   * Number of students
   * Marks of each student
   * Your marks

---

## 💡 Example Output

```
Enter the number of students:
5
Enter the marks of the students:
85 78 92 69 74
Enter your marks:
90
Class average (mean): 79.6
Standard deviation: 7.75
Your grade is: S
```

---
