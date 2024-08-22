# Real-time Password Validation

This Android application provides real-time password validation using Jetpack Compose. The app validates passwords based on three criteria: minimum length, special characters, and uppercase letters.

## Features

- **Real-time Validation**: The app validates the password as the user types and provides instant feedback on whether the password meets the required criteria.
- **Validation Criteria**:
  - Minimum length of 8 characters
  - At least one special character
  - At least one uppercase letter
- **User Interface**: Built using Jetpack Compose with Material3 components for a modern and responsive design.

## Screenshots

<img src="https://github.com/user-attachments/assets/63673596-b018-4814-ae5d-03df432758e1" alt="First Screenshot" style="width: 200px; height: auto;">

## Architecture

The app follows the MVVM (Model-View-ViewModel) architecture:

- **MainActivity**: Hosts the Composable UI.
- **MyScreenViewModel**: Manages the password state and triggers validation.
- **ValidatePassword**: Contains the business logic for password validation.
- **PasswordValidationState**: Represents the state of the password validation.

## How to Use

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Bhavyansh03-tech/Real-time_Password_Validation.git
   ```
2. Open the project in Android Studio.
3. Build the project and run it on an emulator or a physical device.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new Pull Request.

## Contact

For questions or feedback, please contact [@Bhavyansh03-tech](https://github.com/Bhavyansh03-tech) on GitHub or connect with me on [LinkedIn](https://www.linkedin.com/in/bhavyansh03/).

---
