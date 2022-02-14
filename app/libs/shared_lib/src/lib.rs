use uniffi_macros;

uniffi_macros::include_scaffolding!("shared_lib");

fn add(a: u32, b: u32) -> u32 {
    println!("The result is: {}", a + b);
    return a + b;
}