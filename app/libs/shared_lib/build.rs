fn main() {
    uniffi_build::generate_scaffolding("./src/shared_lib.udl").unwrap();
}