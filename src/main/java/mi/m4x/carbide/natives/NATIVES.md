# natives Directory Overview

This folder contains classes and utilities related to native interoperability, operating system detection, and calling conventions.

## Files

- `Architecture.java`  
  Defines and manages different CPU architectures supported by the project.

- `OperatingSystems.java`  
  Enumerates and provides utilities for handling various operating systems.

## Subfolders

### annotation

- `OperatingSystemArchPair.java`  
  Annotation for specifying a combination of operating system and architecture, typically used for conditional logic or configuration.

### utility

- `CallConventionOverride.java`  
  Utility class for overriding the default calling convention used in native method invocations. Provides static methods to set and retrieve the override.

---

Each file is designed to support platform-specific logic and native integration within the project.