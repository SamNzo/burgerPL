burger(L):-
% liste des features
L=[F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20, F21, F22, F23, F24, F25, F26, F27, F28, F29, F30],

fd_domain(L,0,1),

% racine
F1 #= 1,

% mandatory
F2 #= F1,
F18 #= F1,
F17 #= F16,

% optional
F8 #=< F1,

% include
F16 #==> F17, 

% xor
F3 + F4 + F5 + F6 + F7 #= F2,
F9 + F16 #= F8,
F10 + F11 + F12 #= F9,
F13 + F14 + F15 #= F11,
F24 + F25 #= F23,

% or
F20 + F21 + F22 #=< 3 * F19,
F27 + F28 + F29 + F30 #=< 4 * F26,

% range
F19 + F23 + F26 #=< 3 * F18,
F19 + F23 + F26 #>= 1 * F18,
F20 + F21 + F22 #=< 3 * F19,
F20 + F21 + F22 #>= 1 * F19,
F27 + F28 + F29 + F30 #=< 4 * F26,
F27 + F28 + F29 + F30 #>= 1 * F26,

fd_labeling(L).